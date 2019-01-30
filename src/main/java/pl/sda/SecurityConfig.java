package pl.sda;

import org.springframework.boot.autoconfigure.security.SpringBootWebSecurityConfiguration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Controller;

@Controller
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("1234").roles("ADMIN", "SALES").and()
                .withUser("user").password("456").roles("SALES");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/vehicles").permitAll()
                .antMatchers("/vehicles/**").hasRole("SALES")
             //   .antMatchers("/edit/**").hasRole("SALES")
             //   .antMatchers("/raports/**").hasRole("SALES")
            //    .antMatchers("/sale/*").hasRole("ADMIN")
            //    .antMatchers("/purchase/*").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").permitAll()//defaultSuccessUrl("/cars")
                .and().logout().permitAll();
    }

}

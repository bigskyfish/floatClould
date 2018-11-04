package floatClould.floatClould;

import floatClould.user.userService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

    private userService userService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*auth.inMemoryAuthentication().withUser("admin").password("123456").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("user").password("1234").roles("USER");*/
        auth.userDetailsService(userService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //配置需要验证的请求
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated() //其他请求不允许直接访问
                .and()
                .logout().permitAll()//注销操作可以直接访问
                .and()
                .formLogin();//允许表单登录操作
        http.csrf().disable();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        //忽视这些请求
        web.ignoring().antMatchers("/js/**","/css/**","/image/**");
    }
}

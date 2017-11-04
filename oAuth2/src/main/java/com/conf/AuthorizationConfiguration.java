package com.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

/**
 * Created by Nir on 8/4/2017.
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationConfiguration extends AuthorizationServerConfigurerAdapter {

    private final AuthenticationManager authenticationManager;

    @Autowired
    public AuthorizationConfiguration(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.authenticationManager(authenticationManager)
        ;

    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory().withClient("nir").secret("niro")
                .scopes("1").autoApprove(".*")
                .authorizedGrantTypes("authorization_code")
        ;
    }
}

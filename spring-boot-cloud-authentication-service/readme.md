# Authentication Server
    
    - Contains some static users
    
    
    ```
    @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()                                               // static users
                    .withUser("zone1").password("mypassword").roles("USER")
                    .and()
                    .withUser("zone2").password("mypassword").roles("USER")
                    .and()
                    .withUser("zone3").password("mypassword").roles("USER")
                    .and()
                    .withUser("zone4").password("mypassword").roles("USER")
                    .and()
                    .withUser("zone5").password("mypassword").roles("USER");
        }
    ```
    
    - Contains some static client secrate and client id
    
    ```
     @Override
        public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
            clients.inMemory()
                    .withClient("javadeveloperzone")
                    .secret("secret")
                    .accessTokenValiditySeconds(2000)        // expire time for access token
                    .refreshTokenValiditySeconds(-1)         // expire time for refresh token
                    .scopes("read", "write")                         // scope related to resource server
                    .authorizedGrantTypes("password", "refresh_token");      // grant type
        }
     ```
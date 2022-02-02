package com.example.SmsSender;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;
import com.twilio.http.HttpMethod;
import com.twilio.rest.api.v2010.account.Application;

@Configuration
@ConfigurationProperties("twilio")

public class TwilioConfiguration {

    private String accountSid;
    private String authToken;
    private String smsNumber;

    public TwilioConfiguration(){}

    public String getAccountSid() {
        return accountSid;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String setAuthToken() {
        return authToken;
    }

    public String getSmsNumber() {
        return smsNumber;
    }

    public String setSmsNumber() {
        return smsNumber;
    }
}

package com.tokbox.sample.basicvideochat;

import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;

public class OpenTokConfig {
    /*
    Fill the following variables using your own Project info from the OpenTok dashboard
    https://dashboard.tokbox.com/projects

    Note that this application will ignore credentials in the `OpenTokConfig` file when `CHAT_SERVER_URL` contains a
    valid URL.
    */

    // Replace with a API key
    public static final String API_KEY = "46264952";
    
    // Replace with a generated Session ID
    public static final String SESSION_ID = "2_MX40NjI2NDk1Mn5-MTY1OTQyNzk4MTc3NX4rL1ZXNU96SzcvOUVsSmZXb3pLeVg3RVF-fg";
    public static final String SESSION_ID2 = "2_MX40NjI2NDk1Mn5-MTY1OTQyODAyODgxOX5yblByM09DYmFQUXZOVVhzNjF1WlhmWVd-fg";
    // Replace with a generated token (from the dashboard or using an OpenTok server SDK)
    public static final String TOKEN = "T1==cGFydG5lcl9pZD00NjI2NDk1MiZzaWc9MGJmNWZiZjIyMTE1ODA3ZDRhYTE5YzRlYzgxMTlhMWQ1NjQzMmMxNDpzZXNzaW9uX2lkPTJfTVg0ME5qSTJORGsxTW41LU1UWTFPVFF5TnprNE1UYzNOWDRyTDFaWE5VOTZTemN2T1VWc1NtWlhiM3BMZVZnM1JWRi1mZyZjcmVhdGVfdGltZT0xNjU5NDI4MDAzJm5vbmNlPTAuNzA0NTY5NTEwNjEwOTEyMiZyb2xlPXB1Ymxpc2hlciZleHBpcmVfdGltZT0xNjYwMDMyODA1JmluaXRpYWxfbGF5b3V0X2NsYXNzX2xpc3Q9";
    public static final String TOKEN2 = "T1==cGFydG5lcl9pZD00NjI2NDk1MiZzaWc9MGY3OWI5NjNiN2RhY2I5NDc1NjNkZjBlMzFkMDhiMTM1MjQyOThlMTpzZXNzaW9uX2lkPTJfTVg0ME5qSTJORGsxTW41LU1UWTFPVFF5T0RBeU9EZ3hPWDV5YmxCeU0wOURZbUZRVVhaT1ZWaHpOakYxV2xobVdWZC1mZyZjcmVhdGVfdGltZT0xNjU5NDI4MDQ1Jm5vbmNlPTAuNTQyMzUwODk0MzcxMjI1OSZyb2xlPXB1Ymxpc2hlciZleHBpcmVfdGltZT0xNjYwMDMyODQ3JmluaXRpYWxfbGF5b3V0X2NsYXNzX2xpc3Q9";

    // *** The code below is to validate this configuration file. You do not need to modify it  ***

    public static boolean isValid() {
        if (TextUtils.isEmpty(OpenTokConfig.API_KEY)
                || TextUtils.isEmpty(OpenTokConfig.SESSION_ID)
                || TextUtils.isEmpty(OpenTokConfig.TOKEN)) {
            return false;
        }

        return true;
    }

    @NonNull
    public static String getDescription() {
        return "OpenTokConfig:" + "\n"
                + "API_KEY: " + OpenTokConfig.API_KEY + "\n"
                + "SESSION_ID: " + OpenTokConfig.SESSION_ID + "\n"
                + "TOKEN: " + OpenTokConfig.TOKEN + "\n";
    }
}

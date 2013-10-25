package com.fonerevolution.oauthd;

/*
**        The authenticationFinished is called when the authorize dialog closes.
**
*/

public interface OAuthCallback {
        public abstract void onFinished(OAuthData data);
}
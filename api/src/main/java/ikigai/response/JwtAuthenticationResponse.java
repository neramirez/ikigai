package ikigai.response;

public class JwtAuthenticationResponse {
    private String accessToken;
    private Boolean finishedWelcomeFlow;

    public JwtAuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

}
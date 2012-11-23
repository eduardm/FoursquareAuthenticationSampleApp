package foursquareauthenticatesampleapp

class HomeController {
    def foursquareAuthenticationService

    def index() { }

    def callback() {
        def (OAuthToken, status) = foursquareAuthenticationService.getOauthToken(params.code)
        return [status: status]
    }
}

<h1>Sample page that helps with the FoursquareAuthenticate plugin implementation</h1>
<div>
    <button id="fsqButton">Login with Foursquare</button>
    <fsq:fsqLoginEvent elementId="fsqButton" onSuccess="FSQSampleApp.doOnSuccess" onFailure="FSQSampleApp.doOnFailure"/>
</div>
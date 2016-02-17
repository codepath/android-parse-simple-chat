# Simple Chat Client Using Parse

The sample code explains how to build a very simple chat application in Android using Parse backend-as-a-service.

>**Note:** This chat application is by no means a fully-featured or production ready chat function. This tutorial is an illustration of how to quickly build an app using [Parse](https://www.parse.com).

## Usage

In order to be able to run this app, clone it and update the `applicationId`, `server` and `clientKey` in `ChatApplication.java` file.

```java
Parse.initialize(new Parse.Configuration.Builder(this)
             .applicationId("YOUR_APPLICATION_ID") // should correspond to APP_ID env variable
             .addNetworkInterceptor(new ParseLogInterceptor())
             .server("https://myparseapp.herokuapp.com/parse/")
             .clientKey("YOUR_CLIENT_KEY").build());
```

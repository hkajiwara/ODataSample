# ODataSample

_Sample programs for server and client using OData_

## Build

```
$ git clone https://github.com/hkajiwara/ODataSample.git
$ cd ODataSample
$ mvn clean package
```

## Deploy to Heroku

```
$ git clone https://github.com/hkajiwara/ODataSample.git
$ cd ODataSample

$ heroku create
$ git push heroku master
$ heroku config:set "APP_OPTS=--enable-basic-auth --basic-auth-user guest --basic-auth-pw hogehoge7"
```

## Add a sample data from local
```
$ git clone https://github.com/hkajiwara/ODataSample.git
$ cd ODataSample
$ mvn clean package
$ mvn exec:java -Dexec.mainClass="odatasample.client.ODataSampleApp" -Dexec.args="https://<your app name>.herokuapp.com/odata"
```

## License

Released under the [MIT Licenses](http://opensource.org/licenses/MIT)

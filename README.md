# rabbitmq-admin

[![Build Status](https://travis-ci.org/indeedeng/rabbitmq-admin.svg?branch=master)](https://travis-ci.org/indeedeng/rabbitmq-admin)
![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.indeed/rabbitmq-admin/badge.svg
)
![NetflixOSS Lifecycle](https://img.shields.io/osslifecycle/indeedeng/rabbitmq-admin.svg)

A lightweight library used to communicate with the RabbitMQ Management API.

# Usage
This library uses Retrofit under the covers. To construct a `RabbitManagementApi` instance, just use `RabbitManagementApiFactory.newInstance()`:
```
final RabbitManagementApi api = RabbitManagementApiFactory.newInstance(
    URI.create("localhost:15672"),
    "rabbit-username",
    "rabbit-password"
);

api.listQueues();
```

You can see the full API in [RabbitManagementApi.java](src/main/java/com/indeed/rabbitmq/admin/RabbitManagementApi.java)

# Running tests
Just run `./gradlew test`

# Contributing
Please review [CONTRIBUTING.md](CONTRIBUTING.md)

# Code of Conduct
rabbitmq-admin is governed by the [Contributor Covenant v 1.4.1](CODE_OF_CONDUCT.md).

# License
rabbitmq-admin is licensed under the [Apache 2 License](LICENSE).

# gradle-multimodule-starter

Gradle has been around for a while, but it has continued to evolve with the times. Gradle makes it easy to support multi-module projects, especially if you adopt some of their more recent conventions. This project represents my opinions on how to create one of these projects in the simplest way possible. Please feel free to use it as a guide or template for your own projects.

### java conventions

Build a module, and run the unit tests.
```shell
./gradlew :hello:build
```

Run an application module.
```shell
./gradlew :hello:run
```

Run the integration tests.
```
./gradlew :hello:integrationTest
```

### docker conventions

Build a docker image.
```shell
./gradlew :hello:dockerBuild
```
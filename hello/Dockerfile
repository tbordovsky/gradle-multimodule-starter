FROM gradle:7.4-jdk17 AS BUILD
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle clean :hello:installDist --no-daemon

FROM openjdk:17-slim
WORKDIR /var/lib/gradle-multimodule-starter/hello
COPY --from=BUILD /home/gradle/src/hello/build/install/hello .

CMD [ "bin/hello" ]
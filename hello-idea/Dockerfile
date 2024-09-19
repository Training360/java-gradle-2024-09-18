FROM eclipse-temurin:21

WORKDIR /app
#ADD build/distributions/hello-idea-1.0-SNAPSHOT.tar .
#ENTRYPOINT ["hello-idea-1.0-SNAPSHOT/bin/hello-idea"]

COPY build/dependencies/* .
COPY build/libs/* .

ENTRYPOINT ["java", "-classpath", "core-3.5.3.jar:hello-idea-1.0-SNAPSHOT.jar:jai-imageio-core-1.4.0.jar:javase-3.5.3.jar", "training.Main"]
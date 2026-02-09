FROM eclipse-temurin:21-jre-alpine

WORKDIR /app/bin

COPY target/*.jar app.jar
# 设置时区
ENV TZ=Asia/Shanghai

ENTRYPOINT  ["/bin/sh", "-c", "exec java ${JAVA_OPTS} -jar ${JAR_PACKAGE}"]

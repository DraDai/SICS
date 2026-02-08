FROM eclipse-temurin:21-jre-alpine

WORKDIR /app/bin

ARG JAR_PACKAGE

ENV JAR_PACKAGE=${JAR_PACKAGE}

COPY ${JAR_PACKAGE} /app/bin
# 设置时区
ENV TZ=Asia/Shanghai

ENTRYPOINT  ["/bin/sh", "-c", "exec java ${JAVA_OPTS} -jar ${JAR_PACKAGE}"]

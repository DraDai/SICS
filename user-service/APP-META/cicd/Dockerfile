FROM eclipse-temurin:21-jdk-alpine
# 先创建一个空的jar文件，让COPY指令有东西可复制，避免构建失败
RUN touch app.jar
COPY app.jar app.jar
# 或者，如果你在pom.xml中配置了spring-boot-maven-plugin，可以先打包一个简单的jar
# COPY target/*.jar app.jar
ENTRYPOINT ["echo", "This is a placeholder image"]

FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

COPY target/*.jar app.jar
# 设置时区
ENV TZ=Asia/Shanghai

# 添加健康检查
HEALTHCHECK --interval=30s --timeout=3s --start-period=30s --retries=3 \
  CMD wget --quiet --tries=1 --spider http://localhost:8080/actuator/health || exit 1

ENTRYPOINT  ["java","-jar","app.jar"]

docker run -p 8080:8080 -p 9990:9990 \
    -e WILDFLY_PASSWORD=wildfly123 \
    --add-host=host.docker.internal:host-gateway \
    --name wildfly \
    jboss/wildfly:latest

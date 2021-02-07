FROM postgres:latest
ONBUILD RUN --entrypoint docker-entrypoint.sh -P --env POSTGRES_USER=northwind --env POSTGRES_PASSWORD=northwind123 --name northwind-container postgres:latest postgres
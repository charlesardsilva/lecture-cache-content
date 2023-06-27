set -e

printf "Running compile phase\n"
mvn clean package -f $(pwd)

printf "Running application\n"
mvn spring-boot:run
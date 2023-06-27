set -e

RANDOM_KEY=""
API_VERSION=""

random_key() {
  RANDOM_KEY=$(( $RANDOM % 5))
}

do_request() {
  printf "Start test at %s \n" "$(date +"%T.%3N")"

  for i in {1..20}
  do
     random_key
     printf "key %s" "$RANDOM_KEY"
     curl -X GET -s --show-error --fail -w '\nTotal Time: %{time_total}s \n' "localhost:8080/$API_VERSION/page/products/$RANDOM_KEY" -o /dev/null
  done

  printf "\nFinish test at %s \n" "$(date +"%T.%3N")"
}

API_VERSION=$1
printf "Chosen API Version: %s \n" "$API_VERSION"
do_request



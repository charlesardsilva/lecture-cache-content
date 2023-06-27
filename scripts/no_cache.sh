RANDOM_KEY

random_key() {
  RANDOM_KEY=$(( $RANDOM % 5))
}

do_request() {
  printf "Start test at %s \n" "$(date +"%T.%3N")"

  for i in {1..20}
  do
     random_key
     printf "key %s" "$RANDOM_KEY"
     curl -X GET -s -w '\nTotal Time: %{time_total}s \n' localhost:8080/v1/page/products/$RANDOM_KEY -o /dev/null
  done

  printf "\nFinish test at %s \n" "$(date +"%T.%3N")"
}

time do_request



set ENV_FILE=".\.env"

pushd ~\BotJava\

call git checkout main
call git pull origin main

call docker compose -f docker-compose.yml --env-file $ENV_FILE down --timeout=60 --remove-orphans
call docker compose -f docker-compose.yml --env-file $ENV_FILE up --build --detach

popd
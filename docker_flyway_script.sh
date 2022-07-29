#!/usr/bin/env bash

docker-compose down
wait
echo "Docker-compose down complete"
echo "Running docker prune"
docker volume prune --force
wait
echo "Docker prune complete"
echo "Running docker-compose up"
docker-compose up
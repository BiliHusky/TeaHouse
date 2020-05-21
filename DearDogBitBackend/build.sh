#!/bin/bash
mvn clean package

docker build -f Dockerfile -t deardogbit/backend:master .

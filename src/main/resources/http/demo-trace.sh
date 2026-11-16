#!/usr/bin/env bash

BASE_URL="http://localhost:8080"

echo "Trace demo: call the recommendation service through the SNS API"
curl -i "${BASE_URL}/api/v1/demo/trace?message=hello&userId=1"

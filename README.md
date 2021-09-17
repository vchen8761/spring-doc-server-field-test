# Reprex of Springdoc Auto generated api server field inconsistency 

Attempted to override servers field in api-docs(json) and api-docs(yaml) but refreshing api-docs resets the server field and accessing the other file extension also resets it

Api-docs at:
http://localhost:8080/v3/api-docs
and
http://localhost:8080/v3/api-docs.yaml

Expected behavior:
{"openapi":"3.0.1","info":{"title":"OpenAPI definition","version":"v1"},"servers":[{"url":"","description":"My URL"}],"paths":{},"components":{}}

After refreshing or switching to json or yaml:
{"openapi":"3.0.1","info":{"title":"OpenAPI definition","version":"v1"},"servers":[{"url":"http://localhost:8080","description":"Generated server url"}],"paths":{},"components":{}}

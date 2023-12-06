# cicd-using-github-actions

* GitHub Actions is a continuous integration and continuous delivery (CI/CD) platform that allows you to automate your build, test, and deployment pipeline. You can create workflows that build and test every pull request to your repository, or deploy merged pull requests to production.
* To know more about GitHub Actions [click here](https://docs.github.com/en/actions/learn-github-actions/understanding-github-actions)

## Project details
* This is very sample application to perform ci-cd using GitHub actions
* Whenever a commit is pushed into GitHub repo, It will test and build the application using maven. 
* In addition, It will build a docker image and will be pushed to dockerhub


# Test
* It has one endpoint (/home) with this message "Hi There. This is very sample application to perform ci-cd using GitHub actions"
* While testing in local try this url http://localhost:8080/home

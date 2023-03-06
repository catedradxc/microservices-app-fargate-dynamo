# microservices-app-fargate-dynamo
microservices with persistence layer to be deployed with AWS Fargate

A version of [this application](https://github.com/catedradxc/microservices-app-AWSFargate) adapted to use a AWS DynamoDB database. To the process made to deploy the original version you have to add the following step:

* Create and configure tables in the AWS DynamoDB service panel with the correct names


The result architecture is:
![image](https://user-images.githubusercontent.com/79599587/223156435-b8ffe269-15fc-4e51-828e-527b529846fc.png)

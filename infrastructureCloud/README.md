# infrastructure

<b> CSYE 6225CLOUD COMPUTING : 10 </b>

the aws demo account is configured

- aws configure --profile demo
provide the access key, secret access key, default region, default output type


-aws configure --profile dev


- fOR STACK DESCRIPTION 
aws cloudformation --profile dev


Validating the template
aws cloudformtion validate-template --template-body file path --profile dev


Creating stack without parameter
aws cloudformation create-stack --stack-name firstVPC --template-body file://csye6225-infra.yml --profile dev/demo


Creating stack without parameter in region
aws cloudformation --region us-east-1 create-stack --stack-name vpc- --template-body file://csye6225-infra.yml --profile dev

Creating stack with parameter
 aws cloudformation create-stack --stack-name myvpcparametertest --template-body file://csye6225-infra.yml --parameters ParameterKey=VpcCIDR,ParameterValue="10.0.0.0/16" ParameterKey=PublicSubnet1CIDR,ParameterValue="10.0.1.0/24" ParameterKey=PublicSubnet2CIDR,ParameterValue="10.0.2.0/24" ParameterKey=PublicSubnet3CIDR,ParameterValue="10.0.3.0/24" --profile dev

deleting a stack
aws cloudformation delete-stack --stack-name firstVPC --profile dev/demo
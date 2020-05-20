/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.awss3;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwss3SinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_AWSS3_PATH_BUCKET_NAME_OR_ARN_CONF = "camel.sink.path.bucketNameOrArn";
    public static final String CAMEL_SINK_AWSS3_PATH_BUCKET_NAME_OR_ARN_DOC = "Bucket name or ARN";
    public static final String CAMEL_SINK_AWSS3_PATH_BUCKET_NAME_OR_ARN_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_AMAZON_S3CLIENT_CONF = "camel.sink.endpoint.amazonS3Client";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_AMAZON_S3CLIENT_DOC = "Reference to a com.amazonaws.services.s3.AmazonS3 in the registry.";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_AMAZON_S3CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_CONF = "camel.sink.endpoint.autoCreateBucket";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_DOC = "Setting the autocreation of the bucket";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_DEFAULT = true;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_ENDPOINT_CONFIGURATION_CONF = "camel.sink.endpoint.endpointConfiguration";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_ENDPOINT_CONFIGURATION_DOC = "Amazon AWS Endpoint Configuration";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_ENDPOINT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_CONF = "camel.sink.endpoint.pathStyleAccess";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_DOC = "Whether or not the S3 client should use path style access";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_POLICY_CONF = "camel.sink.endpoint.policy";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_POLICY_DOC = "The policy for this queue to set in the com.amazonaws.services.s3.AmazonS3#setBucketPolicy() method.";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_POLICY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PROXY_HOST_DOC = "To define a proxy host when instantiating the S3 client";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PORT_DOC = "Specify a proxy port to be used inside the client definition.";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PROTOCOL_CONF = "camel.sink.endpoint.proxyProtocol";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the S3 client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_REGION_CONF = "camel.sink.endpoint.region";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_REGION_DOC = "The region in which S3 client needs to work. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1) You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_CONF = "camel.sink.endpoint.useIAMCredentials";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_DOC = "Set whether the S3 client should expect to load credentials on an EC2 instance or to expect static credentials to be passed in.";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_CONF = "camel.sink.endpoint.encryptionMaterials";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_DOC = "The encryption materials to use in case of Symmetric/Asymmetric client usage";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_USE_ENCRYPTION_CONF = "camel.sink.endpoint.useEncryption";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_USE_ENCRYPTION_DOC = "Define if encryption must be used or not";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_USE_ENCRYPTION_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_DELETE_AFTER_WRITE_CONF = "camel.sink.endpoint.deleteAfterWrite";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_DELETE_AFTER_WRITE_DOC = "Delete file object after the S3 file has been uploaded";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_DELETE_AFTER_WRITE_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_KEY_NAME_CONF = "camel.sink.endpoint.keyName";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_KEY_NAME_DOC = "Setting the key name for an element in the bucket through endpoint parameter";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_KEY_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_MULTI_PART_UPLOAD_CONF = "camel.sink.endpoint.multiPartUpload";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_MULTI_PART_UPLOAD_DOC = "If it is true, camel will upload the file with multi part format, the part size is decided by the option of partSize";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_MULTI_PART_UPLOAD_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_OPERATION_CONF = "camel.sink.endpoint.operation";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_OPERATION_DOC = "The operation to do in case the user don't want to do only an upload One of: [copyObject] [deleteBucket] [listBuckets] [downloadLink]";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PART_SIZE_CONF = "camel.sink.endpoint.partSize";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PART_SIZE_DOC = "Setup the partSize which is used in multi part upload, the default size is 25M.";
    public static final Long CAMEL_SINK_AWSS3_ENDPOINT_PART_SIZE_DEFAULT = 26214400L;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_SERVER_SIDE_ENCRYPTION_CONF = "camel.sink.endpoint.serverSideEncryption";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_SERVER_SIDE_ENCRYPTION_DOC = "Sets the server-side encryption algorithm when encrypting the object using AWS-managed keys. For example use AES256.";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_SERVER_SIDE_ENCRYPTION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_STORAGE_CLASS_CONF = "camel.sink.endpoint.storageClass";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_STORAGE_CLASS_DOC = "The storage class to set in the com.amazonaws.services.s3.model.PutObjectRequest request.";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_STORAGE_CLASS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_AWS_KMSKEY_ID_CONF = "camel.sink.endpoint.awsKMSKeyId";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_AWS_KMSKEY_ID_DOC = "Define the id of KMS key to use in case KMS is enabled";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_AWS_KMSKEY_ID_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_USE_AWS_KMSCONF = "camel.sink.endpoint.useAwsKMS";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_USE_AWS_KMSDOC = "Define if KMS must be used or not";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_USE_AWS_KMSDEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_CONF = "camel.sink.endpoint.accelerateModeEnabled";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_DOC = "Define if Accelerate Mode enabled is true or false";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_CONF = "camel.sink.endpoint.chunkedEncodingDisabled";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_DOC = "Define if disabled Chunked Encoding is true or false";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_DUALSTACK_ENABLED_CONF = "camel.sink.endpoint.dualstackEnabled";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_DUALSTACK_ENABLED_DOC = "Define if Dualstack enabled is true or false";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_DUALSTACK_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_CONF = "camel.sink.endpoint.forceGlobalBucketAccessEnabled";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DOC = "Define if Force Global Bucket Access enabled is true or false";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_CONF = "camel.sink.endpoint.payloadSigningEnabled";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_DOC = "Define if Payload Signing enabled is true or false";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_AWSS3_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_ACCESS_KEY_CONF = "camel.sink.endpoint.accessKey";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_SECRET_KEY_CONF = "camel.sink.endpoint.secretKey";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWSS3_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_AMAZON_S3CLIENT_CONF = "camel.component.aws-s3.amazonS3Client";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_AMAZON_S3CLIENT_DOC = "Reference to a com.amazonaws.services.s3.AmazonS3 in the registry.";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_AMAZON_S3CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_AUTO_CREATE_BUCKET_CONF = "camel.component.aws-s3.autoCreateBucket";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_AUTO_CREATE_BUCKET_DOC = "Setting the autocreation of the bucket";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_AUTO_CREATE_BUCKET_DEFAULT = true;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_CONFIGURATION_CONF = "camel.component.aws-s3.configuration";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_CONFIGURATION_DOC = "The component configuration";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_ENDPOINT_CONFIGURATION_CONF = "camel.component.aws-s3.endpointConfiguration";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_ENDPOINT_CONFIGURATION_DOC = "Amazon AWS Endpoint Configuration";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_ENDPOINT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PATH_STYLE_ACCESS_CONF = "camel.component.aws-s3.pathStyleAccess";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PATH_STYLE_ACCESS_DOC = "Whether or not the S3 client should use path style access";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_PATH_STYLE_ACCESS_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_POLICY_CONF = "camel.component.aws-s3.policy";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_POLICY_DOC = "The policy for this queue to set in the com.amazonaws.services.s3.AmazonS3#setBucketPolicy() method.";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_POLICY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PROXY_HOST_CONF = "camel.component.aws-s3.proxyHost";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PROXY_HOST_DOC = "To define a proxy host when instantiating the S3 client";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PROXY_PORT_CONF = "camel.component.aws-s3.proxyPort";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PROXY_PORT_DOC = "Specify a proxy port to be used inside the client definition.";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PROXY_PROTOCOL_CONF = "camel.component.aws-s3.proxyProtocol";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the S3 client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_REGION_CONF = "camel.component.aws-s3.region";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_REGION_DOC = "The region in which S3 client needs to work. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1) You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_REGION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_USE_IAMCREDENTIALS_CONF = "camel.component.aws-s3.useIAMCredentials";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_USE_IAMCREDENTIALS_DOC = "Set whether the S3 client should expect to load credentials on an EC2 instance or to expect static credentials to be passed in.";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_USE_IAMCREDENTIALS_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_ENCRYPTION_MATERIALS_CONF = "camel.component.aws-s3.encryptionMaterials";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_ENCRYPTION_MATERIALS_DOC = "The encryption materials to use in case of Symmetric/Asymmetric client usage";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_ENCRYPTION_MATERIALS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_USE_ENCRYPTION_CONF = "camel.component.aws-s3.useEncryption";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_USE_ENCRYPTION_DOC = "Define if encryption must be used or not";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_USE_ENCRYPTION_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_DELETE_AFTER_WRITE_CONF = "camel.component.aws-s3.deleteAfterWrite";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_DELETE_AFTER_WRITE_DOC = "Delete file object after the S3 file has been uploaded";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_DELETE_AFTER_WRITE_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_KEY_NAME_CONF = "camel.component.aws-s3.keyName";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_KEY_NAME_DOC = "Setting the key name for an element in the bucket through endpoint parameter";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_KEY_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.aws-s3.lazyStartProducer";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_MULTI_PART_UPLOAD_CONF = "camel.component.aws-s3.multiPartUpload";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_MULTI_PART_UPLOAD_DOC = "If it is true, camel will upload the file with multi part format, the part size is decided by the option of partSize";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_MULTI_PART_UPLOAD_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_OPERATION_CONF = "camel.component.aws-s3.operation";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_OPERATION_DOC = "The operation to do in case the user don't want to do only an upload One of: [copyObject] [deleteBucket] [listBuckets] [downloadLink]";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_OPERATION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PART_SIZE_CONF = "camel.component.aws-s3.partSize";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PART_SIZE_DOC = "Setup the partSize which is used in multi part upload, the default size is 25M.";
    public static final Long CAMEL_SINK_AWSS3_COMPONENT_PART_SIZE_DEFAULT = 26214400L;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_SERVER_SIDE_ENCRYPTION_CONF = "camel.component.aws-s3.serverSideEncryption";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_SERVER_SIDE_ENCRYPTION_DOC = "Sets the server-side encryption algorithm when encrypting the object using AWS-managed keys. For example use AES256.";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_SERVER_SIDE_ENCRYPTION_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_STORAGE_CLASS_CONF = "camel.component.aws-s3.storageClass";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_STORAGE_CLASS_DOC = "The storage class to set in the com.amazonaws.services.s3.model.PutObjectRequest request.";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_STORAGE_CLASS_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_AWS_KMSKEY_ID_CONF = "camel.component.aws-s3.awsKMSKeyId";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_AWS_KMSKEY_ID_DOC = "Define the id of KMS key to use in case KMS is enabled";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_AWS_KMSKEY_ID_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_USE_AWS_KMSCONF = "camel.component.aws-s3.useAwsKMS";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_USE_AWS_KMSDOC = "Define if KMS must be used or not";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_USE_AWS_KMSDEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_ACCELERATE_MODE_ENABLED_CONF = "camel.component.aws-s3.accelerateModeEnabled";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_ACCELERATE_MODE_ENABLED_DOC = "Define if Accelerate Mode enabled is true or false";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_ACCELERATE_MODE_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_CHUNKED_ENCODING_DISABLED_CONF = "camel.component.aws-s3.chunkedEncodingDisabled";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_CHUNKED_ENCODING_DISABLED_DOC = "Define if disabled Chunked Encoding is true or false";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_CHUNKED_ENCODING_DISABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_DUALSTACK_ENABLED_CONF = "camel.component.aws-s3.dualstackEnabled";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_DUALSTACK_ENABLED_DOC = "Define if Dualstack enabled is true or false";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_DUALSTACK_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_CONF = "camel.component.aws-s3.forceGlobalBucketAccessEnabled";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DOC = "Define if Force Global Bucket Access enabled is true or false";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PAYLOAD_SIGNING_ENABLED_CONF = "camel.component.aws-s3.payloadSigningEnabled";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_PAYLOAD_SIGNING_ENABLED_DOC = "Define if Payload Signing enabled is true or false";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_PAYLOAD_SIGNING_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.aws-s3.basicPropertyBinding";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_ACCESS_KEY_CONF = "camel.component.aws-s3.accessKey";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_AWSS3_COMPONENT_SECRET_KEY_CONF = "camel.component.aws-s3.secretKey";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SINK_AWSS3_COMPONENT_SECRET_KEY_DEFAULT = null;

    public CamelAwss3SinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwss3SinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_AWSS3_PATH_BUCKET_NAME_OR_ARN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_PATH_BUCKET_NAME_OR_ARN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_AWSS3_PATH_BUCKET_NAME_OR_ARN_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_AMAZON_S3CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_AMAZON_S3CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_AMAZON_S3CLIENT_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_ENDPOINT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_ENDPOINT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_ENDPOINT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_POLICY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_POLICY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_POLICY_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_USE_ENCRYPTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_USE_ENCRYPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_USE_ENCRYPTION_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_DELETE_AFTER_WRITE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_DELETE_AFTER_WRITE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_DELETE_AFTER_WRITE_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_KEY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_KEY_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_KEY_NAME_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_MULTI_PART_UPLOAD_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_MULTI_PART_UPLOAD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_MULTI_PART_UPLOAD_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_PART_SIZE_CONF, ConfigDef.Type.LONG, CAMEL_SINK_AWSS3_ENDPOINT_PART_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_PART_SIZE_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_SERVER_SIDE_ENCRYPTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_SERVER_SIDE_ENCRYPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_SERVER_SIDE_ENCRYPTION_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_STORAGE_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_STORAGE_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_STORAGE_CLASS_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_AWS_KMSKEY_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_AWS_KMSKEY_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_AWS_KMSKEY_ID_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_USE_AWS_KMSCONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_USE_AWS_KMSDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_USE_AWS_KMSDOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_DUALSTACK_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_DUALSTACK_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_DUALSTACK_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSS3_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_AMAZON_S3CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_AMAZON_S3CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_AMAZON_S3CLIENT_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_AUTO_CREATE_BUCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_AUTO_CREATE_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_AUTO_CREATE_BUCKET_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_ENDPOINT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_ENDPOINT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_ENDPOINT_CONFIGURATION_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_PATH_STYLE_ACCESS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_PATH_STYLE_ACCESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_PATH_STYLE_ACCESS_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_POLICY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_POLICY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_POLICY_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_REGION_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_USE_IAMCREDENTIALS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_USE_IAMCREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_USE_IAMCREDENTIALS_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_ENCRYPTION_MATERIALS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_ENCRYPTION_MATERIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_ENCRYPTION_MATERIALS_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_USE_ENCRYPTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_USE_ENCRYPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_USE_ENCRYPTION_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_DELETE_AFTER_WRITE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_DELETE_AFTER_WRITE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_DELETE_AFTER_WRITE_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_KEY_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_KEY_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_KEY_NAME_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_MULTI_PART_UPLOAD_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_MULTI_PART_UPLOAD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_MULTI_PART_UPLOAD_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_OPERATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_OPERATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_OPERATION_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_PART_SIZE_CONF, ConfigDef.Type.LONG, CAMEL_SINK_AWSS3_COMPONENT_PART_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_PART_SIZE_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_SERVER_SIDE_ENCRYPTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_SERVER_SIDE_ENCRYPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_SERVER_SIDE_ENCRYPTION_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_STORAGE_CLASS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_STORAGE_CLASS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_STORAGE_CLASS_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_AWS_KMSKEY_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_AWS_KMSKEY_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_AWS_KMSKEY_ID_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_USE_AWS_KMSCONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_USE_AWS_KMSDEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_USE_AWS_KMSDOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_ACCELERATE_MODE_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_ACCELERATE_MODE_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_ACCELERATE_MODE_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_CHUNKED_ENCODING_DISABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_CHUNKED_ENCODING_DISABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_CHUNKED_ENCODING_DISABLED_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_DUALSTACK_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_DUALSTACK_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_DUALSTACK_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_PAYLOAD_SIGNING_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_PAYLOAD_SIGNING_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_PAYLOAD_SIGNING_ENABLED_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SINK_AWSS3_COMPONENT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_AWSS3_COMPONENT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_AWSS3_COMPONENT_SECRET_KEY_DOC);
        return conf;
    }
}
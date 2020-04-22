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
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAwss3SourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_AWSS3_PATH_BUCKET_NAME_OR_ARN_CONF = "camel.source.path.bucketNameOrArn";
    public static final String CAMEL_SOURCE_AWSS3_PATH_BUCKET_NAME_OR_ARN_DOC = "Bucket name or ARN";
    public static final String CAMEL_SOURCE_AWSS3_PATH_BUCKET_NAME_OR_ARN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_AMAZON_S3CLIENT_CONF = "camel.source.endpoint.amazonS3Client";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_AMAZON_S3CLIENT_DOC = "Reference to a com.amazonaws.services.s3.AmazonS3 in the registry.";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_AMAZON_S3CLIENT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_CONF = "camel.source.endpoint.autoCreateBucket";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_DOC = "Setting the autocreation of the bucket";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_DEFAULT = true;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_CONF = "camel.source.endpoint.pathStyleAccess";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_DOC = "Whether or not the S3 client should use path style access";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_POLICY_CONF = "camel.source.endpoint.policy";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_POLICY_DOC = "The policy for this queue to set in the com.amazonaws.services.s3.AmazonS3#setBucketPolicy() method.";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_POLICY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_HOST_CONF = "camel.source.endpoint.proxyHost";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_HOST_DOC = "To define a proxy host when instantiating the SQS client";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PORT_CONF = "camel.source.endpoint.proxyPort";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PORT_DOC = "Specify a proxy port to be used inside the client definition.";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PROTOCOL_CONF = "camel.source.endpoint.proxyProtocol";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PROTOCOL_DOC = "To define a proxy protocol when instantiating the S3 client One of: [HTTP] [HTTPS]";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PROTOCOL_DEFAULT = "HTTPS";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_REGION_CONF = "camel.source.endpoint.region";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_REGION_DOC = "The region in which S3 client needs to work. When using this parameter, the configuration will expect the capitalized name of the region (for example AP_EAST_1) You'll need to use the name Regions.EU_WEST_1.name()";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_REGION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_CONF = "camel.source.endpoint.useIAMCredentials";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_DOC = "Set whether the S3 client should expect to load credentials on an EC2 instance or to expect static credentials to be passed in.";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_CONF = "camel.source.endpoint.encryptionMaterials";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_DOC = "The encryption materials to use in case of Symmetric/Asymmetric client usage";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_USE_ENCRYPTION_CONF = "camel.source.endpoint.useEncryption";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_USE_ENCRYPTION_DOC = "Define if encryption must be used or not";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_USE_ENCRYPTION_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_DELETE_AFTER_READ_CONF = "camel.source.endpoint.deleteAfterRead";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_DELETE_AFTER_READ_DOC = "Delete objects from S3 after they have been retrieved. The delete is only performed if the Exchange is committed. If a rollback occurs, the object is not deleted. If this option is false, then the same objects will be retrieve over and over again on the polls. Therefore you need to use the Idempotent Consumer EIP in the route to filter out duplicates. You can filter using the S3Constants#BUCKET_NAME and S3Constants#KEY headers, or only the S3Constants#KEY header.";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_DELETE_AFTER_READ_DEFAULT = true;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_DELIMITER_CONF = "camel.source.endpoint.delimiter";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_DELIMITER_DOC = "The delimiter which is used in the com.amazonaws.services.s3.model.ListObjectsRequest to only consume objects we are interested in.";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_DELIMITER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_FILE_NAME_CONF = "camel.source.endpoint.fileName";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_FILE_NAME_DOC = "To get the object from the bucket with the given file name";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_FILE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_INCLUDE_BODY_CONF = "camel.source.endpoint.includeBody";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_INCLUDE_BODY_DOC = "If it is true, the exchange body will be set to a stream to the contents of the file. If false, the headers will be set with the S3 object metadata, but the body will be null. This option is strongly related to autocloseBody option. In case of setting includeBody to true and autocloseBody to false, it will be up to the caller to close the S3Object stream. Setting autocloseBody to true, will close the S3Object stream automatically.";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_INCLUDE_BODY_DEFAULT = true;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_CONNECTIONS_CONF = "camel.source.endpoint.maxConnections";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_CONNECTIONS_DOC = "Set the maxConnections parameter in the S3 client configuration";
    public static final Integer CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_CONNECTIONS_DEFAULT = 60;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_MESSAGES_PER_POLL_CONF = "camel.source.endpoint.maxMessagesPerPoll";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_MESSAGES_PER_POLL_DOC = "Gets the maximum number of messages as a limit to poll at each polling. Gets the maximum number of messages as a limit to poll at each polling. The default value is 10. Use 0 or a negative number to set it as unlimited.";
    public static final Integer CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_MESSAGES_PER_POLL_DEFAULT = 10;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PREFIX_CONF = "camel.source.endpoint.prefix";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PREFIX_DOC = "The prefix which is used in the com.amazonaws.services.s3.model.ListObjectsRequest to only consume objects we are interested in.";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PREFIX_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF = "camel.source.endpoint.sendEmptyMessageWhenIdle";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC = "If the polling consumer did not poll any files, you can enable this option to send an empty message (no body) instead.";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_AUTOCLOSE_BODY_CONF = "camel.source.endpoint.autocloseBody";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_AUTOCLOSE_BODY_DOC = "If this option is true and includeBody is true, then the S3Object.close() method will be called on exchange completion. This option is strongly related to includeBody option. In case of setting includeBody to true and autocloseBody to false, it will be up to the caller to close the S3Object stream. Setting autocloseBody to true, will close the S3Object stream automatically.";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_AUTOCLOSE_BODY_DEFAULT = true;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_POLL_STRATEGY_CONF = "camel.source.endpoint.pollStrategy";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_POLL_STRATEGY_DOC = "A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing you to provide your custom implementation to control error handling usually occurred during the poll operation before an Exchange have been created and being routed in Camel.";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_POLL_STRATEGY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_CONF = "camel.source.endpoint.accelerateModeEnabled";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_DOC = "Define if Accelerate Mode enabled is true or false";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_CONF = "camel.source.endpoint.chunkedEncodingDisabled";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_DOC = "Define if disabled Chunked Encoding is true or false";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_DUALSTACK_ENABLED_CONF = "camel.source.endpoint.dualstackEnabled";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_DUALSTACK_ENABLED_DOC = "Define if Dualstack enabled is true or false";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_DUALSTACK_ENABLED_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_CONF = "camel.source.endpoint.forceGlobalBucketAccessEnabled";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DOC = "Define if Force Global Bucket Access enabled is true or false";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_CONF = "camel.source.endpoint.payloadSigningEnabled";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_DOC = "Define if Payload Signing enabled is true or false";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF = "camel.source.endpoint.backoffErrorThreshold";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC = "The number of subsequent error polls (failed due some error) that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF = "camel.source.endpoint.backoffIdleThreshold";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC = "The number of subsequent idle polls that should happen before the backoffMultipler should kick-in.";
    public static final Integer CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_MULTIPLIER_CONF = "camel.source.endpoint.backoffMultiplier";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_MULTIPLIER_DOC = "To let the scheduled polling consumer backoff if there has been a number of subsequent idles/errors in a row. The multiplier is then the number of polls that will be skipped before the next actual attempt is happening again. When this option is in use then backoffIdleThreshold and/or backoffErrorThreshold must also be configured.";
    public static final Integer CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_DELAY_CONF = "camel.source.endpoint.delay";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_DELAY_DOC = "Milliseconds before the next poll. You can also specify time values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30 seconds), and 1h (1 hour).";
    public static final Long CAMEL_SOURCE_AWSS3_ENDPOINT_DELAY_DEFAULT = 500L;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_GREEDY_CONF = "camel.source.endpoint.greedy";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_GREEDY_DOC = "If greedy is enabled, then the ScheduledPollConsumer will run immediately again, if the previous run polled 1 or more messages.";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_GREEDY_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_INITIAL_DELAY_CONF = "camel.source.endpoint.initialDelay";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_INITIAL_DELAY_DOC = "Milliseconds before the first poll starts. You can also specify time values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30 seconds), and 1h (1 hour).";
    public static final Long CAMEL_SOURCE_AWSS3_ENDPOINT_INITIAL_DELAY_DEFAULT = 1000L;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_REPEAT_COUNT_CONF = "camel.source.endpoint.repeatCount";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_REPEAT_COUNT_DOC = "Specifies a maximum limit of number of fires. So if you set it to 1, the scheduler will only fire once. If you set it to 5, it will only fire five times. A value of zero or negative means fire forever.";
    public static final Long CAMEL_SOURCE_AWSS3_ENDPOINT_REPEAT_COUNT_DEFAULT = 0L;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_RUN_LOGGING_LEVEL_CONF = "camel.source.endpoint.runLoggingLevel";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_RUN_LOGGING_LEVEL_DOC = "The consumer logs a start/complete log line when it polls. This option allows you to configure the logging level for that. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT = "TRACE";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF = "camel.source.endpoint.scheduledExecutorService";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC = "Allows for configuring a custom/shared thread pool to use for the consumer. By default each consumer has its own single threaded thread pool.";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_CONF = "camel.source.endpoint.scheduler";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_DOC = "To use a cron scheduler from either camel-spring or camel-quartz component One of: [none] [spring] [quartz]";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_DEFAULT = "none";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_PROPERTIES_CONF = "camel.source.endpoint.schedulerProperties";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_PROPERTIES_DOC = "To configure additional properties when using a custom scheduler or any of the Quartz, Spring based scheduler.";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_START_SCHEDULER_CONF = "camel.source.endpoint.startScheduler";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_START_SCHEDULER_DOC = "Whether the scheduler should be auto started.";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_START_SCHEDULER_DEFAULT = true;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_TIME_UNIT_CONF = "camel.source.endpoint.timeUnit";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_TIME_UNIT_DOC = "Time unit for initialDelay and delay options. One of: [NANOSECONDS] [MICROSECONDS] [MILLISECONDS] [SECONDS] [MINUTES] [HOURS] [DAYS]";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_TIME_UNIT_DEFAULT = "MILLISECONDS";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_USE_FIXED_DELAY_CONF = "camel.source.endpoint.useFixedDelay";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_USE_FIXED_DELAY_DOC = "Controls if fixed delay or fixed rate is used. See ScheduledExecutorService in JDK for details.";
    public static final Boolean CAMEL_SOURCE_AWSS3_ENDPOINT_USE_FIXED_DELAY_DEFAULT = true;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_ACCESS_KEY_CONF = "camel.source.endpoint.accessKey";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SECRET_KEY_CONF = "camel.source.endpoint.secretKey";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SOURCE_AWSS3_ENDPOINT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_ACCESS_KEY_CONF = "camel.component.aws-s3.accessKey";
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_ACCESS_KEY_DOC = "Amazon AWS Access Key";
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_ACCESS_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_REGION_CONF = "camel.component.aws-s3.region";
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_REGION_DOC = "The region where the bucket is located. This option is used in the com.amazonaws.services.s3.model.CreateBucketRequest.";
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_REGION_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_SECRET_KEY_CONF = "camel.component.aws-s3.secretKey";
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_SECRET_KEY_DOC = "Amazon AWS Secret Key";
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_SECRET_KEY_DEFAULT = null;
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.aws-s3.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_AWSS3_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.aws-s3.basicPropertyBinding";
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_CONFIGURATION_CONF = "camel.component.aws-s3.configuration";
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_CONFIGURATION_DOC = "The AWS S3 default configuration";
    public static final String CAMEL_SOURCE_AWSS3_COMPONENT_CONFIGURATION_DEFAULT = null;

    public CamelAwss3SourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAwss3SourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf(Map<String, String> parsedConfig) {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_AWSS3_PATH_BUCKET_NAME_OR_ARN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_PATH_BUCKET_NAME_OR_ARN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_AWSS3_PATH_BUCKET_NAME_OR_ARN_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_AMAZON_S3CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_AMAZON_S3CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_AMAZON_S3CLIENT_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_AUTO_CREATE_BUCKET_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_PATH_STYLE_ACCESS_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_POLICY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_POLICY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_POLICY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_PROXY_PROTOCOL_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_REGION_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_USE_IAMCREDENTIALS_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_ENCRYPTION_MATERIALS_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_USE_ENCRYPTION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_USE_ENCRYPTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_USE_ENCRYPTION_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_DELETE_AFTER_READ_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_DELETE_AFTER_READ_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_DELETE_AFTER_READ_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_DELIMITER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_DELIMITER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_DELIMITER_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_FILE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_FILE_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_FILE_NAME_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_INCLUDE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_INCLUDE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_INCLUDE_BODY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_CONNECTIONS_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_CONNECTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_CONNECTIONS_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_MESSAGES_PER_POLL_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_MESSAGES_PER_POLL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_MAX_MESSAGES_PER_POLL_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_PREFIX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_PREFIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_PREFIX_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_SEND_EMPTY_MESSAGE_WHEN_IDLE_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_AUTOCLOSE_BODY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_AUTOCLOSE_BODY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_AUTOCLOSE_BODY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_POLL_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_POLL_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_POLL_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_ACCELERATE_MODE_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_CHUNKED_ENCODING_DISABLED_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_DUALSTACK_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_DUALSTACK_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_DUALSTACK_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_FORCE_GLOBAL_BUCKET_ACCESS_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_PAYLOAD_SIGNING_ENABLED_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_ERROR_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_ERROR_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_IDLE_THRESHOLD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_IDLE_THRESHOLD_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_MULTIPLIER_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_MULTIPLIER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_BACKOFF_MULTIPLIER_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_AWSS3_ENDPOINT_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_DELAY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_GREEDY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_GREEDY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_GREEDY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_INITIAL_DELAY_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_AWSS3_ENDPOINT_INITIAL_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_INITIAL_DELAY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_REPEAT_COUNT_CONF, ConfigDef.Type.LONG, CAMEL_SOURCE_AWSS3_ENDPOINT_REPEAT_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_REPEAT_COUNT_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_RUN_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_RUN_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_RUN_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULED_EXECUTOR_SERVICE_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_PROPERTIES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_PROPERTIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_SCHEDULER_PROPERTIES_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_START_SCHEDULER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_START_SCHEDULER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_START_SCHEDULER_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_TIME_UNIT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_TIME_UNIT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_TIME_UNIT_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_USE_FIXED_DELAY_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_ENDPOINT_USE_FIXED_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_USE_FIXED_DELAY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_ENDPOINT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_ENDPOINT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_ENDPOINT_SECRET_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_COMPONENT_ACCESS_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_COMPONENT_ACCESS_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_COMPONENT_ACCESS_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_COMPONENT_REGION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_COMPONENT_REGION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_COMPONENT_REGION_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_COMPONENT_SECRET_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_COMPONENT_SECRET_KEY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_COMPONENT_SECRET_KEY_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_AWSS3_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_AWSS3_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_AWSS3_COMPONENT_CONFIGURATION_DOC);
        return conf;
    }
}
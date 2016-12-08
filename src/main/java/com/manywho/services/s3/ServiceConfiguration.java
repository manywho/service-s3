package com.manywho.services.s3;

import com.manywho.sdk.api.ContentType;
import com.manywho.sdk.services.configuration.Configuration;

public class ServiceConfiguration implements Configuration {
    @Configuration.Setting(name="Bucket Name", contentType = ContentType.Password)
    private String bucketName;

    @Configuration.Setting(name="AWS Access Key Id", contentType = ContentType.Password)
    private String awsAccessKeyId;

    @Configuration.Setting(name="AWS Secret Access Key", contentType = ContentType.Password)
    private String awsSecretAccessKey;

    public String getBucketName() {
        return bucketName;
    }

    public String getAwsAccessKeyId() {
        return awsAccessKeyId;
    }

    public String getAwsSecretAccessKey() {
        return awsSecretAccessKey;
    }
}

/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/StartDocumentTextDetection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDocumentTextDetectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     */
    private DocumentLocation documentLocation;
    /**
     * <p>
     * The idempotent token that's used to identify the start request. If you use the same token with multiple
     * <code>StartDocumentTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once. For more
     * information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/api-async.html">Calling Amazon Textract
     * Asynchronous Operations</a>.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * An identifier that you specify that's included in the completion notification published to the Amazon SNS topic.
     * For example, you can use <code>JobTag</code> to identify the type of document that the completion notification
     * corresponds to (such as a tax form or a receipt).
     * </p>
     */
    private String jobTag;
    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to.
     * </p>
     */
    private NotificationChannel notificationChannel;
    /**
     * <p>
     * Sets if the output will go to a customer defined bucket. By default Amazon Textract will save the results
     * internally to be accessed with the GetDocumentTextDetection operation.
     * </p>
     */
    private OutputConfig outputConfig;

    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     * 
     * @param documentLocation
     *        The location of the document to be processed.
     */

    public void setDocumentLocation(DocumentLocation documentLocation) {
        this.documentLocation = documentLocation;
    }

    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     * 
     * @return The location of the document to be processed.
     */

    public DocumentLocation getDocumentLocation() {
        return this.documentLocation;
    }

    /**
     * <p>
     * The location of the document to be processed.
     * </p>
     * 
     * @param documentLocation
     *        The location of the document to be processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDocumentTextDetectionRequest withDocumentLocation(DocumentLocation documentLocation) {
        setDocumentLocation(documentLocation);
        return this;
    }

    /**
     * <p>
     * The idempotent token that's used to identify the start request. If you use the same token with multiple
     * <code>StartDocumentTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once. For more
     * information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/api-async.html">Calling Amazon Textract
     * Asynchronous Operations</a>.
     * </p>
     * 
     * @param clientRequestToken
     *        The idempotent token that's used to identify the start request. If you use the same token with multiple
     *        <code>StartDocumentTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once.
     *        For more information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/api-async.html">Calling
     *        Amazon Textract Asynchronous Operations</a>.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The idempotent token that's used to identify the start request. If you use the same token with multiple
     * <code>StartDocumentTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once. For more
     * information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/api-async.html">Calling Amazon Textract
     * Asynchronous Operations</a>.
     * </p>
     * 
     * @return The idempotent token that's used to identify the start request. If you use the same token with multiple
     *         <code>StartDocumentTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     *         <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once.
     *         For more information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/api-async.html">Calling
     *         Amazon Textract Asynchronous Operations</a>.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The idempotent token that's used to identify the start request. If you use the same token with multiple
     * <code>StartDocumentTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     * <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once. For more
     * information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/api-async.html">Calling Amazon Textract
     * Asynchronous Operations</a>.
     * </p>
     * 
     * @param clientRequestToken
     *        The idempotent token that's used to identify the start request. If you use the same token with multiple
     *        <code>StartDocumentTextDetection</code> requests, the same <code>JobId</code> is returned. Use
     *        <code>ClientRequestToken</code> to prevent the same job from being accidentally started more than once.
     *        For more information, see <a href="https://docs.aws.amazon.com/textract/latest/dg/api-async.html">Calling
     *        Amazon Textract Asynchronous Operations</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDocumentTextDetectionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * An identifier that you specify that's included in the completion notification published to the Amazon SNS topic.
     * For example, you can use <code>JobTag</code> to identify the type of document that the completion notification
     * corresponds to (such as a tax form or a receipt).
     * </p>
     * 
     * @param jobTag
     *        An identifier that you specify that's included in the completion notification published to the Amazon SNS
     *        topic. For example, you can use <code>JobTag</code> to identify the type of document that the completion
     *        notification corresponds to (such as a tax form or a receipt).
     */

    public void setJobTag(String jobTag) {
        this.jobTag = jobTag;
    }

    /**
     * <p>
     * An identifier that you specify that's included in the completion notification published to the Amazon SNS topic.
     * For example, you can use <code>JobTag</code> to identify the type of document that the completion notification
     * corresponds to (such as a tax form or a receipt).
     * </p>
     * 
     * @return An identifier that you specify that's included in the completion notification published to the Amazon SNS
     *         topic. For example, you can use <code>JobTag</code> to identify the type of document that the completion
     *         notification corresponds to (such as a tax form or a receipt).
     */

    public String getJobTag() {
        return this.jobTag;
    }

    /**
     * <p>
     * An identifier that you specify that's included in the completion notification published to the Amazon SNS topic.
     * For example, you can use <code>JobTag</code> to identify the type of document that the completion notification
     * corresponds to (such as a tax form or a receipt).
     * </p>
     * 
     * @param jobTag
     *        An identifier that you specify that's included in the completion notification published to the Amazon SNS
     *        topic. For example, you can use <code>JobTag</code> to identify the type of document that the completion
     *        notification corresponds to (such as a tax form or a receipt).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDocumentTextDetectionRequest withJobTag(String jobTag) {
        setJobTag(jobTag);
        return this;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to.
     * </p>
     * 
     * @param notificationChannel
     *        The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation
     *        to.
     */

    public void setNotificationChannel(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to.
     * </p>
     * 
     * @return The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation
     *         to.
     */

    public NotificationChannel getNotificationChannel() {
        return this.notificationChannel;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to.
     * </p>
     * 
     * @param notificationChannel
     *        The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation
     *        to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDocumentTextDetectionRequest withNotificationChannel(NotificationChannel notificationChannel) {
        setNotificationChannel(notificationChannel);
        return this;
    }

    /**
     * <p>
     * Sets if the output will go to a customer defined bucket. By default Amazon Textract will save the results
     * internally to be accessed with the GetDocumentTextDetection operation.
     * </p>
     * 
     * @param outputConfig
     *        Sets if the output will go to a customer defined bucket. By default Amazon Textract will save the results
     *        internally to be accessed with the GetDocumentTextDetection operation.
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * <p>
     * Sets if the output will go to a customer defined bucket. By default Amazon Textract will save the results
     * internally to be accessed with the GetDocumentTextDetection operation.
     * </p>
     * 
     * @return Sets if the output will go to a customer defined bucket. By default Amazon Textract will save the results
     *         internally to be accessed with the GetDocumentTextDetection operation.
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * <p>
     * Sets if the output will go to a customer defined bucket. By default Amazon Textract will save the results
     * internally to be accessed with the GetDocumentTextDetection operation.
     * </p>
     * 
     * @param outputConfig
     *        Sets if the output will go to a customer defined bucket. By default Amazon Textract will save the results
     *        internally to be accessed with the GetDocumentTextDetection operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDocumentTextDetectionRequest withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDocumentLocation() != null)
            sb.append("DocumentLocation: ").append(getDocumentLocation()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getJobTag() != null)
            sb.append("JobTag: ").append(getJobTag()).append(",");
        if (getNotificationChannel() != null)
            sb.append("NotificationChannel: ").append(getNotificationChannel()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDocumentTextDetectionRequest == false)
            return false;
        StartDocumentTextDetectionRequest other = (StartDocumentTextDetectionRequest) obj;
        if (other.getDocumentLocation() == null ^ this.getDocumentLocation() == null)
            return false;
        if (other.getDocumentLocation() != null && other.getDocumentLocation().equals(this.getDocumentLocation()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getJobTag() == null ^ this.getJobTag() == null)
            return false;
        if (other.getJobTag() != null && other.getJobTag().equals(this.getJobTag()) == false)
            return false;
        if (other.getNotificationChannel() == null ^ this.getNotificationChannel() == null)
            return false;
        if (other.getNotificationChannel() != null && other.getNotificationChannel().equals(this.getNotificationChannel()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocumentLocation() == null) ? 0 : getDocumentLocation().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getJobTag() == null) ? 0 : getJobTag().hashCode());
        hashCode = prime * hashCode + ((getNotificationChannel() == null) ? 0 : getNotificationChannel().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        return hashCode;
    }

    @Override
    public StartDocumentTextDetectionRequest clone() {
        return (StartDocumentTextDetectionRequest) super.clone();
    }

}

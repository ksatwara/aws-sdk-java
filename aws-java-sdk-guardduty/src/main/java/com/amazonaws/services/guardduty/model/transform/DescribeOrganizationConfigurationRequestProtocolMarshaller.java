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
package com.amazonaws.services.guardduty.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;

import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.*;
import com.amazonaws.protocol.Protocol;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeOrganizationConfigurationRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeOrganizationConfigurationRequestProtocolMarshaller implements
        Marshaller<Request<DescribeOrganizationConfigurationRequest>, DescribeOrganizationConfigurationRequest> {

    private static final OperationInfo SDK_OPERATION_BINDING = OperationInfo.builder().protocol(Protocol.REST_JSON).requestUri("/detector/{detectorId}/admin")
            .httpMethodName(HttpMethodName.GET).hasExplicitPayloadMember(false).hasPayloadMembers(false).serviceName("AmazonGuardDuty").build();

    private final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory;

    public DescribeOrganizationConfigurationRequestProtocolMarshaller(com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeOrganizationConfigurationRequest> marshall(DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest) {

        if (describeOrganizationConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            final ProtocolRequestMarshaller<DescribeOrganizationConfigurationRequest> protocolMarshaller = protocolFactory.createProtocolMarshaller(
                    SDK_OPERATION_BINDING, describeOrganizationConfigurationRequest);

            protocolMarshaller.startMarshalling();
            DescribeOrganizationConfigurationRequestMarshaller.getInstance().marshall(describeOrganizationConfigurationRequest, protocolMarshaller);
            return protocolMarshaller.finishMarshalling();
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}

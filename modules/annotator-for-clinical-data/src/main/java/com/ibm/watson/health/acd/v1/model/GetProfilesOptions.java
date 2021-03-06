/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.health.acd.v1.model;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * The getProfiles options.
 */
public class GetProfilesOptions extends GenericModel {


  /**
   * Builder.
   */
  public static class Builder {

    private Builder(GetProfilesOptions getProfilesOptions) {
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetProfilesOptions.
     *
     * @return the getProfilesOptions
     */
    public GetProfilesOptions build() {
      return new GetProfilesOptions(this);
    }
  }

  private GetProfilesOptions(Builder builder) {
  }

  /**
   * New builder.
   *
   * @return a GetProfilesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

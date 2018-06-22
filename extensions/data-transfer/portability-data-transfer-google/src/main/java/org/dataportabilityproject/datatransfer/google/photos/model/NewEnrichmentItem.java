/*
 * Copyright 2018 The Data Transfer Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dataportabilityproject.datatransfer.google.photos.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewEnrichmentItem {

  @JsonProperty("textEnrichment")
  private TextEnrichment textEnrichment;

  @JsonProperty("locationEnrichment")
  private LocationEnrichment locationEnrichment;

  @JsonProperty("mapEnrichment")
  private MapEnrichment mapEnrichment;

  public class TextEnrichment {
    @JsonProperty("text")
    private String text;
  }

  public class LocationEnrichment {
    @JsonProperty("location")
    private Location location;
  }

  public class MapEnrichment {
    @JsonProperty("origin")
    private Location origin;

    @JsonProperty("destination")
    private Location destination;
  }

}
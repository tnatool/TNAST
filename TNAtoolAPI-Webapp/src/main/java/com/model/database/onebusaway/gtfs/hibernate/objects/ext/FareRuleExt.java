/**
 * Copyright (C) 2011 Brian Ferris <bdferris@onebusaway.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.model.database.onebusaway.gtfs.hibernate.objects.ext;

import org.onebusaway.csv_entities.schema.annotations.CsvField;
import org.onebusaway.csv_entities.schema.annotations.CsvFields;
import org.onebusaway.gtfs.model.IdentityBean;
import org.onebusaway.gtfs.serialization.mappings.EntityFieldMappingFactory;

@CsvFields(filename = "fare_rules.txt", required = false)
public final class FareRuleExt extends IdentityBean<Integer> {

  private static final long serialVersionUID = 1L;

  @CsvField(ignore = true)
  private int id;

  @CsvField(name = "fare_id", mapping = EntityFieldMappingFactory.class)
  private FareAttributeExt fare;

  @CsvField(name = "route_id", optional = true, mapping = EntityFieldMappingFactory.class)
  private RouteExt route;

  @CsvField(optional = true)
  private String originId;

  @CsvField(optional = true)
  private String destinationId;

  @CsvField(optional = true)
  private String containsId;

  public FareRuleExt() {

  }

  public FareRuleExt(FareRuleExt fr) {
    this.id = fr.id;
    this.fare = fr.fare;
    this.route = fr.route;
    this.originId = fr.originId;
    this.destinationId = fr.destinationId;
    this.containsId = fr.containsId;
  }

  @Override
  public Integer getId() {
    return id;
  }

  @Override
  public void setId(Integer id) {
    this.id = id;
  }

  public FareAttributeExt getFare() {
    return fare;
  }

  public void setFare(FareAttributeExt fare) {
    this.fare = fare;
  }

  public RouteExt getRoute() {
    return route;
  }

  public void setRoute(RouteExt route) {
    this.route = route;
  }

  public String getOriginId() {
    return originId;
  }

  public void setOriginId(String originId) {
    this.originId = originId;
  }

  public String getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }

  public String getContainsId() {
    return containsId;
  }

  public void setContainsId(String containsId) {
    this.containsId = containsId;
  }

  public String toString() {
    return "<FareRule " + getId() + ">";
  }
}

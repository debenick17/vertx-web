package io.vertx.ext.web.openapi;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

/**
 * Converter and mapper for {@link io.vertx.ext.web.openapi.RouterFactoryOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.web.openapi.RouterFactoryOptions} original class using Vert.x codegen.
 */
public class RouterFactoryOptionsConverter {


   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, RouterFactoryOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "mountNotImplementedHandler":
          if (member.getValue() instanceof Boolean) {
            obj.setMountNotImplementedHandler((Boolean)member.getValue());
          }
          break;
        case "mountResponseContentTypeHandler":
          if (member.getValue() instanceof Boolean) {
            obj.setMountResponseContentTypeHandler((Boolean)member.getValue());
          }
          break;
        case "operationModelKey":
          if (member.getValue() instanceof String) {
            obj.setOperationModelKey((String)member.getValue());
          }
          break;
        case "requireSecurityHandlers":
          if (member.getValue() instanceof Boolean) {
            obj.setRequireSecurityHandlers((Boolean)member.getValue());
          }
          break;
        case "routeNamingStrategy":
          if (member.getValue() instanceof String) {
            obj.setRouteNamingStrategy(io.vertx.ext.web.openapi.RouterFactoryOptions.RouteNamingStrategy.valueOf((String)member.getValue()));
          }
          break;
      }
    }
  }

   static void toJson(RouterFactoryOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

   static void toJson(RouterFactoryOptions obj, java.util.Map<String, Object> json) {
    json.put("mountNotImplementedHandler", obj.isMountNotImplementedHandler());
    json.put("mountResponseContentTypeHandler", obj.isMountResponseContentTypeHandler());
    if (obj.getOperationModelKey() != null) {
      json.put("operationModelKey", obj.getOperationModelKey());
    }
    json.put("requireSecurityHandlers", obj.isRequireSecurityHandlers());
    if (obj.getRouteNamingStrategy() != null) {
      json.put("routeNamingStrategy", obj.getRouteNamingStrategy().name());
    }
  }
}

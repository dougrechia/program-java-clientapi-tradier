package io.swagger.api;

import io.swagger.model.Balances;
import java.math.BigDecimal;
import io.swagger.model.OrderPost;
import io.swagger.model.Orders;
import io.swagger.model.Positions;
import io.swagger.model.Profile;
import io.swagger.model.Quotes;
import io.swagger.model.SymbolLookup;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Tradier API
 *
 * <p>Tradier API
 *
 */
@Path("/")
public interface DefaultApi  {

    @GET
    @Path("/v1/accounts/{accountId}/balances")
    @Produces({ "application/xml" })
    @Operation(summary = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Get balances information for a specific user account.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Balances.class))),
        @ApiResponse(responseCode = "401", description = "Access token is missing or invalid") })
    public Balances v1AccountsAccountIdBalancesGet(@PathParam("accountId") String accountId);

    @GET
    @Path("/v1/accounts/{accountId}/orders")
    @Produces({ "application/xml" })
    @Operation(summary = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Get orders for a specific user account.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Orders.class))),
        @ApiResponse(responseCode = "401", description = "Access token is missing or invalid") })
    public Orders v1AccountsAccountIdOrdersGet(@PathParam("accountId") String accountId, @QueryParam("includeTags")String includeTags);

    @POST
    @Path("/v1/accounts/{accountId}/orders")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/xml" })
    @Operation(summary = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Post a new order", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = OrderPost.class))),
        @ApiResponse(responseCode = "401", description = "Access token is missing or invalid") })
    public OrderPost v1AccountsAccountIdOrdersPost(@Multipart(value = "class")  String propertyClass, @Multipart(value = "symbol")  String symbol, @Multipart(value = "side")  String side, @Multipart(value = "quantity")  BigDecimal quantity, @Multipart(value = "type")  String type, @Multipart(value = "duration")  String duration, @Multipart(value = "tag")  String tag, @PathParam("accountId") String accountId);

    @GET
    @Path("/v1/accounts/{accountId}/positions")
    @Produces({ "application/xml" })
    @Operation(summary = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Get positions for a specific user account.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Positions.class))),
        @ApiResponse(responseCode = "401", description = "Access token is missing or invalid") })
    public Positions v1AccountsAccountIdPositionsGet(@PathParam("accountId") String accountId);

    @GET
    @Path("/v1/markets/lookup")
    @Produces({ "application/xml" })
    @Operation(summary = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Fetches a symbol list filtered by a tip.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = SymbolLookup.class))),
        @ApiResponse(responseCode = "401", description = "Access token is missing or invalid") })
    public SymbolLookup v1MarketsLookupGet(@QueryParam("q")String q, @QueryParam("types")String types);

    @GET
    @Path("/v1/markets/quotes")
    @Produces({ "application/xml" })
    @Operation(summary = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Fetches a symbol list filtered by a tip.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Quotes.class))),
        @ApiResponse(responseCode = "401", description = "Access token is missing or invalid") })
    public Quotes v1MarketsQuotesGet(@QueryParam("symbols")String symbols);

    @GET
    @Path("/v1/user/profile")
    @Produces({ "application/xml" })
    @Operation(summary = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The user’s profile contains information pertaining to the user and his/her accounts.", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Profile.class))),
        @ApiResponse(responseCode = "401", description = "Access token is missing or invalid") })
    public Profile v1UserProfileGet();
}

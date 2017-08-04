/**
 * 
 */
/**
 * @author XtremeAlex
 *
 */
package com.xa.mwo.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path(value = "/settings")
public class Options_Rest {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAllUtente() throws Exception {

		try {

			Map<String, String[]> option = new HashMap<>();
			option.put("findAllInfo",
					new String[] { "GET", ".../api/xtremealex/mwo/all", "@HeaderParam (email) and (password)" });

			option.put("findInfo",
					new String[] { "GET", ".../api/xtremealex/mwo/info", "@HeaderParam (email) and (password)" });

			option.put("findBaseStatistics",
					new String[] { "GET", ".../api/xtremealex/mwo/base", "@HeaderParam (email) and (password)" });

			option.put("findMechAviable", new String[] { "GET", ".../api/xtremealex/mwo/mech/aviable",
					"@HeaderParam (email) and (password)" });

			option.put("findMechStatisticsCurrent",
					new String[] { "GET", ".../api/xtremealex/mwo/mech/stats", "@HeaderParam (email) and (password)" });

			option.put("findWeaponStatisticsCurrent", new String[] { "GET", ".../api/xtremealex/mwo/mech/weapon/stats",
					"@HeaderParam (email) and (password)" });

			option.put("findMapsStatisticsCurrent",
					new String[] { "GET", ".../api/xtremealex/mwo/maps/stats", "@HeaderParam (email) and (password)" });

			option.put("findModeStatisticsCurrent",
					new String[] { "GET", ".../api/xtremealex/mwo/mode/stats", "@HeaderParam (email) and (password)" });

			
			return Response.status(Status.FOUND).entity(option).build();
			

		} catch (Exception e) {
			return Response.status(Status.BAD_REQUEST).build();

		}
	}

}

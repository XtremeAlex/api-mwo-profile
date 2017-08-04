/**
 * 
 */
/**
 * @author XtremeAlex
 *
 */
package com.xa.mwo.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.modelmapper.ModelMapper;

import com.xa.mwo.login.LogIn;
import com.xa.mwo.modelmapper.dto.UtenteDTO;
import com.xa.mwo.user.service.AnalyzeSource;
import com.xa.mwo.user.service.Utente;

@Path(value = "/mwo")
public class UserStatus_Rest {

	@Inject
	private LogIn log;

	@Inject
	private AnalyzeSource search;

	@Inject
	private ModelMapper modelMapper;

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAllUtente(@HeaderParam("email") String email, @HeaderParam("password") String password)
			throws Exception {

		try {

			Utente utente = new Utente();
			utente.setEmail(email);
			utente.setPassword(password);

			Boolean isLogged = log.logIn(utente);

			if (!isLogged) {
				return Response.status(Status.NOT_ACCEPTABLE).build();
			}

			search.findAllInfo(utente);

			UtenteDTO responseUser = modelMapper.map(utente, UtenteDTO.class);
			return Response.status(Status.FOUND).entity(responseUser).build();

		} catch (Exception e) {
			return Response.status(Status.BAD_REQUEST).build();

		}
	}

	@GET
	@Path("/info")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findInfoUtente(@HeaderParam("email") String email, @HeaderParam("password") String password)
			throws Exception {

		try {

			Utente utente = new Utente();
			utente.setEmail(email);
			utente.setPassword(password);

			Boolean isLogged = log.logIn(utente);

			if (!isLogged) {
				return Response.status(Status.NOT_ACCEPTABLE).build();
			}

			search.findInfo(utente);

			UtenteDTO responseUser = modelMapper.map(utente, UtenteDTO.class);
			return Response.status(Status.FOUND).entity(responseUser).build();

		} catch (Exception e) {
			return Response.status(Status.BAD_REQUEST).build();

		}
	}

	@GET
	@Path("/base")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findBaseStatisticsUtente(@HeaderParam("email") String email,
			@HeaderParam("password") String password) throws Exception {

		try {

			Utente utente = new Utente();
			utente.setEmail(email);
			utente.setPassword(password);

			Boolean isLogged = log.logIn(utente);

			if (!isLogged) {
				return Response.status(Status.NOT_ACCEPTABLE).build();
			}

			search.findBaseStatistics(utente);

			UtenteDTO responseUser = modelMapper.map(utente, UtenteDTO.class);
			return Response.status(Status.FOUND).entity(responseUser).build();

		} catch (Exception e) {
			return Response.status(Status.BAD_REQUEST).build();

		}
	}

	@GET
	@Path("/mech/aviable")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findMechAviable(@HeaderParam("email") String email, @HeaderParam("password") String password)
			throws Exception {

		try {

			Utente utente = new Utente();
			utente.setEmail(email);
			utente.setPassword(password);

			Boolean isLogged = log.logIn(utente);

			if (!isLogged) {
				return Response.status(Status.NOT_ACCEPTABLE).build();
			}

			search.findMechAviable(utente);

			UtenteDTO responseUser = modelMapper.map(utente, UtenteDTO.class);
			return Response.status(Status.FOUND).entity(responseUser).build();

		} catch (Exception e) {
			return Response.status(Status.BAD_REQUEST).build();

		}
	}

	@GET
	@Path("/mech/stats")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findMechStatistics(@HeaderParam("email") String email, @HeaderParam("password") String password)
			throws Exception {

		try {

			Utente utente = new Utente();
			utente.setEmail(email);
			utente.setPassword(password);

			Boolean isLogged = log.logIn(utente);

			if (!isLogged) {
				return Response.status(Status.NOT_ACCEPTABLE).build();
			}

			search.findMechStatisticsCurrent(utente);

			UtenteDTO responseUser = modelMapper.map(utente, UtenteDTO.class);
			return Response.status(Status.FOUND).entity(responseUser).build();

		} catch (Exception e) {
			return Response.status(Status.BAD_REQUEST).build();

		}
	}

	@GET
	@Path("/weapon/stats")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findWeaponStatistics(@HeaderParam("email") String email, @HeaderParam("password") String password)
			throws Exception {

		try {

			Utente utente = new Utente();
			utente.setEmail(email);
			utente.setPassword(password);

			Boolean isLogged = log.logIn(utente);

			if (!isLogged) {
				return Response.status(Status.NOT_ACCEPTABLE).build();
			}

			search.findWeaponStatisticsCurrent(utente);

			UtenteDTO responseUser = modelMapper.map(utente, UtenteDTO.class);
			return Response.status(Status.FOUND).entity(responseUser).build();

		} catch (Exception e) {
			return Response.status(Status.BAD_REQUEST).build();
		}
	}

	@GET
	@Path("/maps/stats")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findMapsStatistics(@HeaderParam("email") String email, @HeaderParam("password") String password)
			throws Exception {

		try {

			Utente utente = new Utente();
			utente.setEmail(email);
			utente.setPassword(password);

			Boolean isLogged = log.logIn(utente);

			if (!isLogged) {
				return Response.status(Status.NOT_ACCEPTABLE).build();
			}

			search.findMapsStatisticsCurrent(utente);

			UtenteDTO responseUser = modelMapper.map(utente, UtenteDTO.class);
			return Response.status(Status.FOUND).entity(responseUser).build();

		} catch (Exception e) {
			return Response.status(Status.BAD_REQUEST).build();

		}
	}

	@GET
	@Path("/mode/stats")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findModeStatistics(@HeaderParam("email") String email, @HeaderParam("password") String password)
			throws Exception {

		try {

			Utente utente = new Utente();
			utente.setEmail(email);
			utente.setPassword(password);

			Boolean isLogged = log.logIn(utente);

			if (!isLogged) {
				return Response.status(Status.NOT_ACCEPTABLE).build();
			}

			search.findModeStatisticsCurrent(utente);

			UtenteDTO responseUser = modelMapper.map(utente, UtenteDTO.class);
			return Response.status(Status.FOUND).entity(responseUser).build();

		} catch (Exception e) {
			return Response.status(Status.BAD_REQUEST).build();

		}
	}

}

package com.mycompany.bluraystore;

import com.mycompany.bluraystore.controller.MovieController;
import com.mycompany.bluraystore.repository.file.FileMovieRepository;
import com.mycompany.bluraystore.service.DefaultMovieService;

/**
 * Hello world!
 *
 */
public class App1
{
    public static void main( String[] args )
    {

        MovieController controller = new MovieController();

        // première façon de gérer l'injection de dépendances
        DefaultMovieService service = new DefaultMovieService();
        controller.setService(service);

        FileMovieRepository repository = new FileMovieRepository();
        service.setRepository(repository);

        controller.addUsingConsole();

        // TODO

        // gérer l'autre façon de gérer l'injection de dépendance avec le principe de réflexivité

    }
}

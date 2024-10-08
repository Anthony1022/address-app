package dev.niss.core.loader;

import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import dev.niss.App;
import javafx.fxml.FXMLLoader;

public abstract class Loader {
    private static final String ROOT_PATH = "/dev/niss/app/";
    public static final String PACKAGE_NAME = "dev.niss.app";

    protected String path;
    protected App app;
    protected FXMLLoader loader;
    protected List<Serializable> params;

    public Loader(String path, App app) {
        this.path = ROOT_PATH + path + ".fxml";
        this.app = app;
        this.params = new LinkedList<>();

        loader = new FXMLLoader();
        loader.setLocation(getResource());
    }

    public void setParameters(Serializable... params) {
        this.params.addAll(Arrays.asList(params));
    }

    public URL getResource() {
        return getClass().getResource(path);
    }

    public InputStream getResourceAsStream() {
        return getClass().getResourceAsStream(path);
    }

    public abstract void load();
}

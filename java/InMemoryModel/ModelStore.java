package InMemoryModel;
// Хранилище моделей

import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Flash;
import ModelElements.Camera;

import java.util.List;
import java.util.ArrayList;


public class ModelStore implements IModelChanger {
    public ModelStore(IModelChangedObserver[] changeObservers) {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel());
        scenes.add(new Scene());
        flashes.add(new Flash());
        cameras.add(new Camera());

    }

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver[] changeObservers;

    // Регистрация изменений моделей
    @Override
    public void notifyChange(IModelChanger sender) {
    }

    public Scene getScena(int id) {
        return null;
    }

}

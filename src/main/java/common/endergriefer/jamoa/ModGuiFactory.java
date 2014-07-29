package common.endergriefer.jamoa;

import cpw.mods.fml.client.IModGuiFactory;
import cpw.mods.fml.client.config.ConfigGuiType;
import cpw.mods.fml.client.config.DummyConfigElement;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Created by noah on 7/24/14.
 */
public class ModGuiFactory implements IModGuiFactory {

    @Override
    public void initialize(Minecraft minecraftInstance) {

    }


    @Override
    public Class<? extends GuiScreen> mainConfigGuiClass() {
        return null;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
        return null;
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
        return null;
    }

    public class ModConfigGui {
        public ModConfigGui(GuiScreen parent, java.util.List<IConfigElement> configElements, String modID, boolean allRequireWorldRestart, boolean allRequireMCRestart, String title) {
            super();


        }

        private List<IConfigElement> getConfigElements() {
            List<IConfigElement> list = new ArrayList<IConfigElement>();
            List<IConfigElement> listsList = new ArrayList<IConfigElement>();
            List<IConfigElement> stringsList = new ArrayList<IConfigElement>();
            List<IConfigElement> numbersList = new ArrayList<IConfigElement>();
            Pattern commaDelimitedPattern = Pattern.compile("([A-Za-z]+((,){1}( )*|$))+?");

            // Top Level Settings
            list.add(new DummyConfigElement<Boolean>("imABoolean", true, ConfigGuiType.BOOLEAN, "fml.config.sample.imABoolean").setRequiresMcRestart(true));
            list.add(new DummyConfigElement<Integer>("imAnInteger", 42, ConfigGuiType.INTEGER, "fml.config.sample.imAnInteger", -1, 256).setRequiresMcRestart(true));
            list.add(new DummyConfigElement<Double>("imADouble", 42.4242D, ConfigGuiType.DOUBLE, "fml.config.sample.imADouble", -1.0D, 256.256D).setRequiresMcRestart(true));
            list.add(new DummyConfigElement<String>("imAString", "http://www.montypython.net/scripts/string.php", ConfigGuiType.STRING, "fml.config.sample.imAString").setRequiresMcRestart(true));

            // Lists category
            listsList.add(new DummyConfigElement.DummyListElement<Boolean>("booleanList", new Boolean[]{true, false, true, false, true, false, true, false}, ConfigGuiType.BOOLEAN, "fml.config.sample.booleanList"));
            listsList.add(new DummyConfigElement.DummyListElement<Boolean>("booleanListFixed", new Boolean[]{true, false, true, false, true, false, true, false}, ConfigGuiType.BOOLEAN, "fml.config.sample.booleanListFixed", true));
            listsList.add(new DummyConfigElement.DummyListElement<Boolean>("booleanListMax", new Boolean[]{true, false, true, false, true, false, true, false}, ConfigGuiType.BOOLEAN, "fml.config.sample.booleanListMax", 10));
            listsList.add(new DummyConfigElement.DummyListElement<Double>("doubleList", new Double[]{0.0D, 1.1D, 2.2D, 3.3D, 4.4D, 5.5D, 6.6D, 7.7D, 8.8D, 9.9D}, ConfigGuiType.DOUBLE, "fml.config.sample.doubleList"));
            listsList.add(new DummyConfigElement.DummyListElement<Double>("doubleListFixed", new Double[]{0.0D, 1.1D, 2.2D, 3.3D, 4.4D, 5.5D, 6.6D, 7.7D, 8.8D, 9.9D}, ConfigGuiType.DOUBLE, "fml.config.sample.doubleListFixed", true));
            listsList.add(new DummyConfigElement.DummyListElement<Double>("doubleListMax", new Double[]{0.0D, 1.1D, 2.2D, 3.3D, 4.4D, 5.5D, 6.6D, 7.7D, 8.8D, 9.9D}, ConfigGuiType.DOUBLE, "fml.config.sample.doubleListMax", 15));
            listsList.add(new DummyConfigElement.DummyListElement<Double>("doubleListBounded", new Double[]{0.0D, 1.1D, 2.2D, 3.3D, 4.4D, 5.5D, 6.6D, 7.7D, 8.8D, 9.9D}, ConfigGuiType.DOUBLE, "fml.config.sample.doubleListBounded", -1.0D, 10.0D));
            listsList.add(new DummyConfigElement.DummyListElement<Integer>("integerList", new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, ConfigGuiType.INTEGER, "fml.config.sample.integerList"));
            listsList.add(new DummyConfigElement.DummyListElement<Integer>("integerListFixed", new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, ConfigGuiType.INTEGER, "fml.config.sample.integerListFixed", true));
            listsList.add(new DummyConfigElement.DummyListElement<Integer>("integerListMax", new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, ConfigGuiType.INTEGER, "fml.config.sample.integerListMax", 15));
            listsList.add(new DummyConfigElement.DummyListElement<Integer>("integerListBounded", new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, ConfigGuiType.INTEGER, "fml.config.sample.integerListBounded", -1, 10));
            listsList.add(new DummyConfigElement.DummyListElement<String>("stringList", new String[]{"An", "array", "of", "string", "values"}, ConfigGuiType.STRING, "fml.config.sample.stringList"));
            listsList.add(new DummyConfigElement.DummyListElement<String>("stringListFixed", new String[]{"A", "fixed", "length", "array", "of", "string", "values"}, ConfigGuiType.STRING, "fml.config.sample.stringListFixed", true));
            listsList.add(new DummyConfigElement.DummyListElement<String>("stringListMax", new String[]{"An", "array", "of", "string", "values", "with", "a", "max", "length", "of", "15"}, ConfigGuiType.STRING, "fml.config.sample.stringListMax", 15));
            listsList.add(new DummyConfigElement.DummyListElement<String>("stringListPattern", new String[]{"Valid", "Not Valid", "Is, Valid", "Comma, Separated, Value"}, ConfigGuiType.STRING, "fml.config.sample.stringListPattern", commaDelimitedPattern));

            list.add(new DummyConfigElement.DummyCategoryElement("lists", "fml.config.sample.ctgy.lists", listsList));

            // Strings category
            stringsList.add(new DummyConfigElement<String>("basicString", "Just a regular String value, anything goes.", ConfigGuiType.STRING, "fml.config.sample.basicString"));
            stringsList.add(new DummyConfigElement<String>("cycleString", "this", ConfigGuiType.STRING, "fml.config.sample.cycleString", new String[]{"this", "property", "cycles", "through", "a", "list", "of", "valid", "choices"}));
            stringsList.add(new DummyConfigElement<String>("patternString", "only, comma, separated, words, can, be, entered, in, this, box", ConfigGuiType.STRING, "fml.config.sample.patternString", commaDelimitedPattern));
            stringsList.add(new DummyConfigElement<String>("chatColorPicker", "c", ConfigGuiType.COLOR, "fml.config.sample.chatColorPicker", new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"}));
            stringsList.add(new DummyConfigElement<String>("modIDSelector", "FML", ConfigGuiType.MOD_ID, "fml.config.sample.modIDSelector"));

            list.add(new DummyConfigElement.DummyCategoryElement("strings", "fml.config.sample.ctgy.strings", stringsList));

            // Numbers category
            numbersList.add((new DummyConfigElement<Integer>("basicInteger", 42, ConfigGuiType.INTEGER, "fml.config.sample.basicInteger")));
            numbersList.add((new DummyConfigElement<Integer>("boundedInteger", 42, ConfigGuiType.INTEGER, "fml.config.sample.boundedInteger", -1, 256)));
            numbersList.add((new DummyConfigElement<Integer>("sliderInteger", 42, ConfigGuiType.INTEGER, "fml.config.sample.sliderInteger", -1, 256)).setCustomListEntryClass(GuiConfigEntries.NumberSliderEntry.class));
            numbersList.add(new DummyConfigElement<Double>("basicDouble", 42.4242D, ConfigGuiType.DOUBLE, "fml.config.sample.basicDouble"));
            numbersList.add(new DummyConfigElement<Double>("boundedDouble", 42.4242D, ConfigGuiType.DOUBLE, "fml.config.sample.boundedDouble", -1.0D, 256.256D));
            numbersList.add(new DummyConfigElement<Double>("sliderDouble", 42.4242D, ConfigGuiType.DOUBLE, "fml.config.sample.sliderDouble", -1.0D, 256.256D).setCustomListEntryClass(GuiConfigEntries.NumberSliderEntry.class));

            list.add(new DummyConfigElement.DummyCategoryElement("numbers", "fml.config.sample.ctgy.numbers", numbersList));

            return list;
        }

    }
}

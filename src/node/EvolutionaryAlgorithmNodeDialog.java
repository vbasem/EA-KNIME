package node;

import org.knime.core.node.defaultnodesettings.DefaultNodeSettingsPane;
import org.knime.core.node.defaultnodesettings.DialogComponentNumber;
import org.knime.core.node.defaultnodesettings.SettingsModelIntegerBounded;

/**
 * <code>NodeDialog</code> for the "EvolutionaryAlgorithm" Node.
 * Node that allows to apply EA method to given data and defined fitness function
 *
 * This node dialog derives from {@link DefaultNodeSettingsPane} which allows
 * creation of a simple dialog with standard components. If you need a more 
 * complex dialog please derive directly from 
 * {@link org.knime.core.node.NodeDialogPane}.
 * 
 * @author basem
 */
public class EvolutionaryAlgorithmNodeDialog extends DefaultNodeSettingsPane {

    /**
     * New pane for configuring EvolutionaryAlgorithm node dialog.
     * This is just a suggestion to demonstrate possible default dialog
     * components.
     */
    protected EvolutionaryAlgorithmNodeDialog() {
        super();
        
        addDialogComponent(new DialogComponentNumber(
                new SettingsModelIntegerBounded(
                    EvolutionaryAlgorithmNodeModel.CFGKEY_COUNT,
                    EvolutionaryAlgorithmNodeModel.DEFAULT_COUNT,
                    Integer.MIN_VALUE, Integer.MAX_VALUE),
                    "Counter:", /*step*/ 1, /*componentwidth*/ 5));
                    
    }
}


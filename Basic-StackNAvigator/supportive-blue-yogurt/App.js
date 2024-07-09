import { Text, SafeAreaView, StyleSheet,View,Image,ImageBackground,TextInput,Button,TouchableOpacity } from 'react-native';

// You can import supported modules from npm
import { Card } from 'react-native-paper';

// or any files within the Snack
import Header from './components/Header';
import LoginForm from './components/LoginForm';
import Footer from './components/Footer';
import List from './components/List';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';

export default function App() {

const Stack = createNativeStackNavigator();

  return (
    <NavigationContainer>

      <Stack.Navigator>

        <Stack.Screen name="Login" component={LoginForm}/>
        <Stack.Screen name="List" component={List}/>

      </Stack.Navigator>

    </NavigationContainer>
   
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    backgroundColor: '#ecf0f1',
    padding: 8,
  }
 
});

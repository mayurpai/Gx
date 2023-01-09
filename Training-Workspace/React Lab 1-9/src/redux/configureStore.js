import { createStore, applyMiddleware, compose } from "redux";
import rootReducer from "./reducers";
import reduxImmutableStateInvariant from "redux-immutable-state-invariant";

import createSagaMiddleware from "redux-saga";
import rootSaga from "./saga/index";

// const sagaMiddleware = createSagaMiddleware();
export default function configureStore(initialState) {
  const composeEnhancers =
    window.__REDUX_DEVTOLS_EXTENSION_COMPOSE__ || compose;

  return createStore(
    rootReducer,
    initialState,
    // applyMiddleware(sagaMiddleware),
    composeEnhancers(applyMiddleware(reduxImmutableStateInvariant()))
    // composeEnhancers(applyMiddleware(sagaMiddleware))
  );
}
// sagaMiddleware.run(rootSaga);

// const sagaMiddleware = createSagaMiddleware();
// const composeEnhancers = window.__REDUX_DEVTOOLS_EXTENSION__ || compose;
// const configureStore = createStore(
//   rootReducer,
//   // initialState,
//   composeEnhancers(applyMiddleware(sagaMiddleware))
// );
// sagaMiddleware.run(rootSaga);

// export default configureStore;

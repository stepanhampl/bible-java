import React, { useState } from 'react';
import './App.css';

function App() {
  const [verse, setVerse] = useState(null);
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState(null);

  const generateVerse = () => {
    setLoading(true);
    setError(null);
    
    fetch('/bible/random')
      .then(response => {
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        return response.json();
      })
      .then(data => {
        setVerse(data);
        setLoading(false);
      })
      .catch(error => {
        setError(error.message);
        setLoading(false);
      });
  };

  return (
    <div className="App">
      <header className="App-header">
        <h1>Generátor Náhodných Biblických Veršů</h1>
        
        {verse && (
          <div className="verse-display">
            <p className="verse-text">
              <em>{verse.text}</em>
            </p>
            <p className="verse-reference">
              {verse.bookName} {verse.chapter}:{verse.verse}
            </p>
          </div>
        )}
        
        <button 
          className="generate-btn" 
          onClick={generateVerse} 
          disabled={loading}
        >
          {loading ? 'Generuji...' : 'generovat'}
        </button>
        
        {error && (
          <p className="error-message">Chyba: {error}</p>
        )}
      </header>
    </div>
  );
}

export default App;

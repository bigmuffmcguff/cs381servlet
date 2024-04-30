from flask import Flask, render_template, request, jsonify

app = Flask(__name__)

# Serve the login page
@app.route('/')
def index():
    return render_template('index.html')

# Handle login request
@app.route('/login', methods=['POST'])
def login():
    username = request.json.get('username')
    password = request.json.get('password')

    # Perform some basic authentication
    if username == 'user' and password == 'password':
        return jsonify({'success': True})
    else:
        return jsonify({'success': False})

if __name__ == '__main__':
    app.run(debug=True)
